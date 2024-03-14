import request from '@/utils/request'

// 查询预约管理列表
export function listAdvanceConfig(query) {
  return request({
    url: '/system/advanceConfig/list',
    method: 'get',
    params: query
  })
}

// 查询预约管理详细
export function getAdvanceConfig(id) {
  return request({
    url: '/system/advanceConfig/' + id,
    method: 'get'
  })
}

// 新增预约管理
export function addAdvanceConfig(data) {
  return request({
    url: '/system/advanceConfig',
    method: 'post',
    data: data
  })
}

// 修改预约管理
export function updateAdvanceConfig(data) {
  return request({
    url: '/system/advanceConfig',
    method: 'put',
    data: data
  })
}

// 删除预约管理
export function delAdvanceConfig(id) {
  return request({
    url: '/system/advanceConfig/' + id,
    method: 'delete'
  })
}
