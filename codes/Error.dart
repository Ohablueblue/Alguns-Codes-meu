
import 'dart:io';
main() {
  print("Inicializando o code"); //print no começo do codigo
  
  print("Nome Do Code:: "); //determinando a entrada do code
  String input = stdin.readLineSync();
 
  
  print("Crinado " + input + "..."); //input criando o code
  for (var i = 0; i < 3; i++ ){
    print("carregando: ${i}" + "%");
    
  } //fim loop (for).
  
  print("carregando: 57%");
  print("carregando: 99%");
  print("...");
  
  for (var j = 0; j < 5; j++){
    print("Carregando: ${j}" + "%");
    
  } //fim for
  
  print("!erro %+@ " 
    + " 404 "   
    + "mundo invalido!");
    
  ConsolePrinter cp = new ConsolePrinter();
  cp.print_data();
  
  
  
} //fim main.


class Printer{
  void print_data() {
    print("________");
  }
  
}

class ConsolePrinter implements Printer {
  void print_data(){
    print("____erro____");
  }
}