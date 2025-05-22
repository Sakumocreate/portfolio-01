function bom() {
  const results = [
    "🎉 大吉 🎉",
    "😊 中吉 😊",
    "😌 小吉 😌",
    "😐 吉 😐",
    "🤔 末吉 🤔",
    "😥 凶 😥",
    "💀 大凶 💀"
  ];
  const randomIndex = Math.floor(Math.random() * results.length);
  document.getElementById("result").textContent = results[randomIndex];
}
const se = new Audio("audio/ニュッ1.mp3");
