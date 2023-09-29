import { Component } from '@angular/core';
import {Aluno} from '../tyypes/Aluno';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent {
  alunos: Aluno[] = [];
  novoAluno: Aluno = { nome: '', Nota1: 0, Nota2: 0, media: 0, situacao: ''};

  adicionarAluno() {
    this.novoAluno.media = (this.novoAluno.Nota1 + this.novoAluno.Nota2) / 2;
    this.novoAluno.situacao = this.novoAluno.media >= 7 ? 'Aprovado' : 'Reprovado';
    this.alunos.push({ ...this.novoAluno });
    this.novoAluno = { nome: '', Nota1: 0, Nota2: 0, media:0, situacao: ''};
  }

  excluirAluno(index: number) {
    this.alunos.splice(index, 1);
  }

}
