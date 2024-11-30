
let p1 = amplitudeX
let p2 = amplitudeY
let p3 = angularFrequencyX
let p4 = angularFrequencyY
var amplitudeX = 100; 
var amplitudeY = 100; 
var angularFrequencyX = 2 * Math.PI / 5; 
var angularFrequencyY = 2 * Math.PI / 4; 
var offsetX = 0; 
var offsetY = Math.PI / 2; 
function updatePosition() {
  var time = new Date().getTime() / 1000; 
  var x = amplitudeX * Math.sin(angularFrequencyX * time + offsetX);
  var y = amplitudeY * Math.sin(angularFrequencyY * time + offsetY);
  var oscillator = document.getElementById('oscillator');
  oscillator.style.transform = `translate({x}px,{y}px)`;
}
function animate() {
  requestAnimationFrame(animate);
  updatePosition();
}
animate();
