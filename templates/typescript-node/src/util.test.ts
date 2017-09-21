import {sayHello, now} from './util'

describe('sayHello', () => {
  it('says hello', () => {
    expect(sayHello()).toBe('Hello, World!')
  })
})

describe('now', () => {
  let dateRe = /\d{4}-\d{2}-\d{2}\s\d{2}:\d{2}:\d{2}/
  it('gets the current timestamp', () => {
    expect(now()).toMatch(dateRe)
  })
})
