import request from '@/utils/request'

// 查询拳馆常识列表
export function listKnowledge(query) {
  return request({
    url: '/system/knowledge/list',
    method: 'get',
    params: query
  })
}

// 查询拳馆常识详细
export function getKnowledge(id) {
  return request({
    url: '/system/knowledge/' + id,
    method: 'get'
  })
}

// 新增拳馆常识
export function addKnowledge(data) {
  return request({
    url: '/system/knowledge',
    method: 'post',
    data: data
  })
}

// 修改拳馆常识
export function updateKnowledge(data) {
  return request({
    url: '/system/knowledge',
    method: 'put',
    data: data
  })
}

// 删除拳馆常识
export function delKnowledge(id) {
  return request({
    url: '/system/knowledge/' + id,
    method: 'delete'
  })
}
