import request from '@/utils/request'

// 查询教练管理列表
export function listTrainer(query) {
  return request({
    url: '/system/trainer/list',
    method: 'get',
    params: query
  })
}

// 查询教练管理详细
export function getTrainer(id) {
  return request({
    url: '/system/trainer/' + id,
    method: 'get'
  })
}

// 新增教练管理
export function addTrainer(data) {
  return request({
    url: '/system/trainer',
    method: 'post',
    data: data
  })
}

// 修改教练管理
export function updateTrainer(data) {
  return request({
    url: '/system/trainer',
    method: 'put',
    data: data
  })
}

// 删除教练管理
export function delTrainer(id) {
  return request({
    url: '/system/trainer/' + id,
    method: 'delete'
  })
}
