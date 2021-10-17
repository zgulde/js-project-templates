const getMovies = require("./getMovies")
// @ponicode
describe("getMovies", () => {
    test("0", () => {
        let callFunction = () => {
            getMovies()
        }
    
        expect(callFunction).not.toThrow()
    })
})
