import {sayHello} from './util'

describe('sayHello', () => {
  it('says hello', () => {
    expect(sayHello()).toBe('Hello, World!')
  })
})
