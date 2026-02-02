// Rotate ingredients around QR dynamically
const ingredients = document.querySelectorAll('.ingredients-circle span');
let angle = 0;

function rotateIngredients() {
  const radius = 70;
  const centerX = 90; // half of ingredients-circle width
  const centerY = 90;
  ingredients.forEach((span, i) => {
    const theta = (i / ingredients.length) * 2 * Math.PI + angle;
    const x = centerX + radius * Math.cos(theta) - span.offsetWidth / 2;
    const y = centerY + radius * Math.sin(theta) - span.offsetHeight / 2;
    span.style.position = 'absolute';
    span.style.left = `${x}px`;
    span.style.top = `${y}px`;
  });
  angle += 0.01;
  requestAnimationFrame(rotateIngredients);
}

rotateIngredients();

