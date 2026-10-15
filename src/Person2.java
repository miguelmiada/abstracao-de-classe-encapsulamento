public record Person2(String name, int age) {
    // (String name, int age) no record todo atributo é pprivado e é usado no seu construtor
    // ele roda por metodo () ex : perso.name () ai roda   


     // public Person2{
       // System.out.println("=====================");
       // System.out.println("name");
       // System.out.println("age");
      //  System.out.println("=====================");    
        // roda antes, instanciou nesse objeto
        //pegou os valores fez atribuição depois que atribuiu, chamou o compact cosnstrutor
        //usado para fazer validação de valores 
   // }


    // public String getInfo(){

       // return " name: " + name + " age: " + age;

  // }  concatenar e retornar uma string com as informações do objeto



   public Person2(String name){

    this (name, 2);

   }

   // Usou o age que definimos 
   //Record : podemos trabalhar com mais de um construtor 
   //porém somos obrigados a chamar o construtor deafult no Record (Main)

   //Por serem imutaveis, todos devem receber um valor obrigatoriamente (pode ser nulo)
}