import request from '@/utils/request'

// 查询会员预约列表
export function listUserAdvance(query) {
  return request({
    url: '/system/userAdvance/list',
    method: 'get',
    params: query
  })
}

// 查询会员预约详细
export function getUserAdvance(id) {
  return request({
    url: '/system/userAdvance/' + id,
    method: 'get'
  })
}

// 新增会员预约
export function addUserAdvance(data) {
  return request({
    url: '/system/userAdvance',
    method: 'post',
    data: data
  })
}

// 修改会员预约
export function updateUserAdvance(data) {
  return request({
    url: '/system/userAdvance',
    method: 'put',
    data: data
  })
}

// 删除会员预约
export function delUserAdvance(id) {
  return request({
    url: '/system/userAdvance/' + id,
    method: 'delete'
  })
}
