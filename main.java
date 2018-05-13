package estudiantes;

public class main {
    public static void main(String[] args) {

        Estudiantes[] estudiantes= new Estudiantes[5];


        estudiantes[0]=new Estudiantes("Elvis","Perez","1726403536");
        estudiantes[1]=new Estudiantes("Anthony","Tacuri","1123803536");
        estudiantes[2]=new Estudiantes("Pablo","Trujillo","1772643536");
        estudiantes[3]=new Estudiantes("Javier","Markley","1726402829");
        estudiantes[4]=new Estudiantes("Steven","Perez","1726353640");

        String[] m={"m1","m2"};
        String[] m2={"m2","m3","m4"};
        String[] m3={"m2","m3","m1","m5"};
        String[] m4={"m1","m2","m3"};
        String[] m5={"m1","m2"};


        estudiantes[0].setMaterias(m);
        estudiantes[1].setMaterias(m2);
        estudiantes[2].setMaterias(m3);
        estudiantes[3].setMaterias(m4);
        estudiantes[4].setMaterias(m5);


        int mat1=0;
        int mat2=0;
        int mat3=0;
        int mat4=0;
        int mat5=0;

        System.out.println("\t\t INFORMACIÓN DE ESTUDIANTES");

        for(int i=0; i<estudiantes.length; i++){

        String [] materiasEstudiantes=estudiantes[i].getMaterias();
            System.out.println("##Estudiante :" + (i + 1));
            System.out.println("Nombre completo: " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido());
            System.out.println("Cedula:" + estudiantes[i].getCedula());
            System.out.println("Materias: ");
            for(int j=0; j< materiasEstudiantes.length; j++){
                System.out.println(" "+ (j+1)+"." +materiasEstudiantes[j]);
               if(materiasEstudiantes[j]=="m1"){
                   mat1=mat1+1;
               }else if(materiasEstudiantes[j]=="m2"){
                   mat2=mat2+1;
               }else if(materiasEstudiantes[j]=="m3"){
                   mat3=mat3+1;
               }else if (materiasEstudiantes[j]=="m4"){
                   mat4=mat4+1;
               }else if(materiasEstudiantes[j]=="m5"){
                   mat5=mat5+1;
               }

              }
            System.out.println();
            }

            System.out.println("\t\t RESUMEN DE MATERIAS");
            System.out.println("M1:"+mat1);
            System.out.println("M2:"+mat2);
            System.out.println("M3:"+mat3);
            System.out.println("M4:"+mat4);
            System.out.println("M5:"+mat5);

        }


    }


