import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {
  mensagens: String[]= [];

  logar(mensagem: String) {
    console.log(mensagem);
    this.mensagens.push(mensagem)
  }

  exibirTodosOsLogs(){
    console.log(this.mensagens)
  }
}
