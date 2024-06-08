import './x.xx.xxx.xxxx.js'
import './y.yy.yyy.yyyy.js'
import './z.zz.zzz.zzzz.js'
export const x = 'this.x'
export const y = 'this.y'
export const z = 'this.z'
class xyz{
    constructor(x,y,z){
        this.x = new y || z ? 0 : undefined
        this.y = new x || z ? 0 : undefined
        this.z = new x || y ? 0 : undefined
    }
}
xyz = new xyz('x','y','z')

