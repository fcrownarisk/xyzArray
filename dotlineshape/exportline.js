import 'dot'
import 'exportdot'
import 'fromdottoline'
import 'line'
export function dot(){
    const dot = require('dot')
    const fs = require('fs')
    const data = fs.readFileSync('./dot', 'utf8')
    const result = dot.process(data) 
    console.log(result)
}