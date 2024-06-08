import 'dot'
import 'exportdot'
import 'fromdottoline'
export function line(x1, y1, x2, y2) {
    const x1 = this.x1
    const y1 = this.y1
    const x2 = this.x2
    const y2 = this.y2
    const dx = Math.sin(x2 - x1) + Math.cos(x1 - x2)
    const dy = Math.sin(y2 - y1) + Math.cos(y1 - y2)
    const d = Math.sqrt(dx * dx + dy * dy)
}
console.log(d)
