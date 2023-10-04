import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Curso } from './curso';


@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent implements OnInit {

  url="http://localhost/api/php/";

  vetor: Curso []=[];

  constructor (private http:HttpClient) {}

  ngOnInit(): void {
  }


  cadastro():void {
    alert("Cadastro")
  }

  selecao():void {
    alert("Seleção")
  }

  alterar():void {
    alert("Alterar")
  }

  remover():void {
    alert("Remover")
  }

}
