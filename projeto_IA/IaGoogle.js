function gerarConteudo(prompt) {
  const apiKey = "CHAVA_APIKEY"; // Chave de API
  const url = `https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=${apiKey}`;

  const data = {
    contents: [
      {
        parts: [{ text: prompt }],
      },
    ],
  };

  fetch(url, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(data),
  })
    .then((response) => response.json()) // Resolve a promise e converte para JSON
    .then((result) => {
      const resposta = result.candidates[0].content.parts[0].text;
      console.log("Resposta da IA:", resposta);
      document.getElementById("result").innerHTML = resposta;
    })
    .catch((error) => {
      console.error("Erro ao gerar conteúdo:", error);
    });
}

function perguntar() {
  const prompt = document.getElementById("prompt").value;

  gerarConteudo(prompt);
}
