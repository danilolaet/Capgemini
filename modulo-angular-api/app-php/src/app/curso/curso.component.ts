import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Curso } from './curso';
import { CursoService } from './curso.service';


@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent implements OnInit {

  url="http://localhost/api/php/";

  vetor: Curso []=[];

  curso=  Curso;

  constructor (private curso_servico:CursoService) {}

  ngOnInit(): void {
    this.selecao();
  }


  cadastro():void {
    alert("Cadastro")
  }

  selecao(): void {
    this.curso_servico.obterCursos().subscribe(
      (res: Curso[]) => {
        this.vetor = res;
      }
    )
  }

  alterar():void {
    alert("Alterar")
  }

  remover():void {
    alert("Remover")
  }

}
