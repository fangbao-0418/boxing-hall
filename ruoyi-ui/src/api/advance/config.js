import request from '@/utils/request'

// 查询预约配置列表
export function listConfig(query) {
  return request({
    url: '/advance/config/list',
    method: 'get',
    params: query
  })
}

// 查询预约配置详细
export function getConfig(id) {
  return request({
    url: '/advance/config/' + id,
    method: 'get'
  })
}

// 新增预约配置
export function addConfig(data) {
  return request({
    url: '/system/config',
    method: 'post',
    data: data
  })
}

// 修改预约配置
export function updateConfig(data) {
  return request({
    url: '/system/config',
    method: 'put',
    data: data
  })
}

// 删除预约配置
export function delConfig(id) {
  return request({
    url: '/advance/config/' + id,
    method: 'delete'
  })
}
