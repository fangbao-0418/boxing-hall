<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="预约标题 教练/课程" prop="title">
        <el-input
          v-model="queryParams.title"
          placeholder="请输入预约标题 教练/课程"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="权重" prop="weight">
        <el-input
          v-model="queryParams.weight"
          placeholder="请输入权重"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="最大可预约人数" prop="maxUsersNum">
        <el-input
          v-model="queryParams.maxUsersNum"
          placeholder="请输入最大可预约人数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课时" prop="times">
        <el-input
          v-model="queryParams.times"
          placeholder="请输入课时"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="售价" prop="price">
        <el-input
          v-model="queryParams.price"
          placeholder="请输入售价"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建时间" prop="gmtCreate">
        <el-input
          v-model="queryParams.gmtCreate"
          placeholder="请输入创建时间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="修改时间" prop="gmtModify">
        <el-input
          v-model="queryParams.gmtModify"
          placeholder="请输入修改时间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="语言标识符" prop="lang">
        <el-input
          v-model="queryParams.lang"
          placeholder="请输入语言标识符"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="语言描述" prop="description">
        <el-input
          v-model="queryParams.description"
          placeholder="请输入语言描述"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="默认语言 0-非默认 1-默认" prop="isDefault">
        <el-input
          v-model="queryParams.isDefault"
          placeholder="请输入默认语言 0-非默认 1-默认"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="google">
        <el-input
          v-model="queryParams.google"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:config:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:config:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:config:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:config:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="configList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="id" />
      <el-table-column label="预约标题 教练/课程" align="center" prop="title" />
      <el-table-column label="权重" align="center" prop="weight" />
      <el-table-column label="最大可预约人数" align="center" prop="maxUsersNum" />
      <el-table-column label="1-教练 2-课程" align="center" prop="type" />
      <el-table-column label="课时" align="center" prop="times" />
      <el-table-column label="售价" align="center" prop="price" />
      <el-table-column label="预约须知" align="center" prop="instruction" />
      <el-table-column label="创建时间" align="center" prop="gmtCreate" />
      <el-table-column label="修改时间" align="center" prop="gmtModify" />
      <el-table-column label="语言标识符" align="center" prop="lang" />
      <el-table-column label="语言描述" align="center" prop="description" />
      <el-table-column label="状态 0-禁用 1-启用" align="center" prop="status" />
      <el-table-column label="默认语言 0-非默认 1-默认" align="center" prop="isDefault" />
      <el-table-column label="${comment}" align="center" prop="google" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:config:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:config:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改预约配置对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="预约标题 教练/课程" prop="title">
          <el-input v-model="form.title" placeholder="请输入预约标题 教练/课程" />
        </el-form-item>
        <el-form-item label="权重" prop="weight">
          <el-input v-model="form.weight" placeholder="请输入权重" />
        </el-form-item>
        <el-form-item label="最大可预约人数" prop="maxUsersNum">
          <el-input v-model="form.maxUsersNum" placeholder="请输入最大可预约人数" />
        </el-form-item>
        <el-form-item label="课时" prop="times">
          <el-input v-model="form.times" placeholder="请输入课时" />
        </el-form-item>
        <el-form-item label="售价" prop="price">
          <el-input v-model="form.price" placeholder="请输入售价" />
        </el-form-item>
        <el-form-item label="预约须知" prop="instruction">
          <el-input v-model="form.instruction" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="创建时间" prop="gmtCreate">
          <el-input v-model="form.gmtCreate" placeholder="请输入创建时间" />
        </el-form-item>
        <el-form-item label="修改时间" prop="gmtModify">
          <el-input v-model="form.gmtModify" placeholder="请输入修改时间" />
        </el-form-item>
        <el-form-item label="语言标识符" prop="lang">
          <el-input v-model="form.lang" placeholder="请输入语言标识符" />
        </el-form-item>
        <el-form-item label="语言描述" prop="description">
          <el-input v-model="form.description" placeholder="请输入语言描述" />
        </el-form-item>
        <el-form-item label="默认语言 0-非默认 1-默认" prop="isDefault">
          <el-input v-model="form.isDefault" placeholder="请输入默认语言 0-非默认 1-默认" />
        </el-form-item>
        <el-form-item label="${comment}" prop="google">
          <el-input v-model="form.google" placeholder="请输入${comment}" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listConfig, getConfig, delConfig, addConfig, updateConfig } from "@/api/advance/config";

export default {
  name: "Config",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 预约配置表格数据
      configList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        title: null,
        weight: null,
        maxUsersNum: null,
        type: null,
        times: null,
        price: null,
        instruction: null,
        gmtCreate: null,
        gmtModify: null,
        lang: null,
        description: null,
        status: null,
        isDefault: null,
        google: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        id: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ],
        title: [
          { required: true, message: "预约标题 教练/课程不能为空", trigger: "blur" }
        ],
        weight: [
          { required: true, message: "权重不能为空", trigger: "blur" }
        ],
        maxUsersNum: [
          { required: true, message: "最大可预约人数不能为空", trigger: "blur" }
        ],
        type: [
          { required: true, message: "1-教练 2-课程不能为空", trigger: "change" }
        ],
        times: [
          { required: true, message: "课时不能为空", trigger: "blur" }
        ],
        price: [
          { required: true, message: "售价不能为空", trigger: "blur" }
        ],
        instruction: [
          { required: true, message: "预约须知不能为空", trigger: "blur" }
        ],
        gmtCreate: [
          { required: true, message: "创建时间不能为空", trigger: "blur" }
        ],
        gmtModify: [
          { required: true, message: "修改时间不能为空", trigger: "blur" }
        ],
        lang: [
          { required: true, message: "语言标识符不能为空", trigger: "blur" }
        ],
        description: [
          { required: true, message: "语言描述不能为空", trigger: "blur" }
        ],
        status: [
          { required: true, message: "状态 0-禁用 1-启用不能为空", trigger: "change" }
        ],
        isDefault: [
          { required: true, message: "默认语言 0-非默认 1-默认不能为空", trigger: "blur" }
        ],
        google: [
          { required: true, message: "$comment不能为空", trigger: "blur" }
        ]
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询预约配置列表 */
    getList() {
      this.loading = true;
      listConfig(this.queryParams).then(response => {
        this.configList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        title: null,
        weight: null,
        maxUsersNum: null,
        type: null,
        times: null,
        price: null,
        instruction: null,
        gmtCreate: null,
        gmtModify: null,
        lang: null,
        description: null,
        status: null,
        isDefault: null,
        google: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加预约配置";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getConfig(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改预约配置";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateConfig(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addConfig(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除预约配置编号为"' + ids + '"的数据项？').then(function() {
        return delConfig(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/config/export', {
        ...this.queryParams
      }, `config_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
