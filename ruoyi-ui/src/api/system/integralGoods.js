import request from '@/utils/request'

// 查询商品积分列表
export function listIntegralGoods(query) {
  return request({
    url: '/system/integral-goods/list',
    method: 'get',
    params: query
  })
}

// 查询商品积分详细
export function getIntegralGoods(id) {
  return request({
    url: '/system/integral-goods/' + id,
    method: 'get'
  })
}

// 新增商品积分
export function addIntegralGoods(data) {
  return request({
    url: '/system/integral-goods',
    method: 'post',
    data: data
  })
}

// 修改商品积分
export function updateIntegralGoods(data) {
  return request({
    url: '/system/integral-goods',
    method: 'put',
    data: data
  })
}

// 删除商品积分
export function delIntegralGoods(id) {
  return request({
    url: '/system/integral-goods/' + id,
    method: 'delete'
  })
}
