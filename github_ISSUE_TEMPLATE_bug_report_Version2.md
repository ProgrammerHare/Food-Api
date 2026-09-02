---
name: Bug Report
about: Relatar um erro ou comportamento inesperado na API
title: '[BUG] '
labels: 'bug'
assignees: ''
---

## 🐛 Descrição do Bug
Uma descrição clara e concisa do que é o bug.

## 🔄 Passos para Reproduzir
1. Envie uma requisição `[POST/GET/PUT/DELETE]` para `/api/...`
2. Com os seguintes dados/parâmetros: `{ ... }`
3. Veja o erro acontecer.

## 🎯 Comportamento Esperado
Uma descrição clara do que deveria ter acontecido (ex: retornar status HTTP `200 OK` com os dados solicitados).

## ❌ Comportamento Atual
Uma descrição do que realmente aconteceu (ex: retornar status HTTP `500 Internal Server Error`).

```json
// Cole o log de erro ou a resposta da API aqui, se houver
{
  "timestamp": "2026-09-02T14:30:00Z",
  "status": 500,
  "error": "Internal Server Error"
}