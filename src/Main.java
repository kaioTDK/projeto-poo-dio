import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import com.sun.jdi.BooleanType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Curso cursoJava = new Curso("Java", "Curso de java com Springboot", (short) 20);
        Curso cursoGrpc = new Curso("Grpc","Curso basico-intermediario de Grpc com java e golang", (short) 8);
        Curso cursoJunit = new Curso("Junit", "curso de junit java", (short)4);
        Curso cursoC = new Curso("C", "Curso introdutório à linguagem C", (short) 4);
        Curso CursoLinux = new Curso("Linux", "introdução a linux com C", (short) 10);

        Mentoria mentoriaJava = new Mentoria("java","auxiliar a introdução ao curso de java");
        Mentoria mentoriaLinux = new Mentoria("Linux", "axiliar a introdução ao linux e à linguagem C");

        Bootcamp javaBC = new Bootcamp("java", "Bootcamp de desenvolvimento java");
        javaBC.getConteudos().add(cursoJava);
        javaBC.getConteudos().add(cursoGrpc);
        javaBC.getConteudos().add(cursoJunit);
        javaBC.getConteudos().add(mentoriaJava);

        Bootcamp linuxBC = new Bootcamp("Linux", "bootcamp introdutóro a desenvolvimento linux em C");
        linuxBC.getConteudos().add(CursoLinux);
        linuxBC.getConteudos().add(cursoC);
        linuxBC.getConteudos().add(mentoriaLinux);

        Dev pedroDev = new Dev("pedro");
        pedroDev.inscreverBootcamp(javaBC);
        System.out.println("Conteúdos em que " + pedroDev.getNome() + "está inscrito: " + pedroDev.getConteudsIncscritos());
        pedroDev.progredir();
        pedroDev.progredir();
        System.out.println("Conteúdos concluidos por " + pedroDev.getNome() +": " + pedroDev.getConteudosConcluidos());
        System.out.println("Xp adquirido por "+ pedroDev.getNome() + ": " + pedroDev.calcularTotalXp());

        System.out.println();

        Dev peterDev = new Dev("peter");
        peterDev.inscreverBootcamp(linuxBC);
        System.out.println("Conteúdos em que " + peterDev.getNome() + "está inscrito: " + peterDev.getConteudsIncscritos());
        peterDev.progredir();
        peterDev.progredir();
        System.out.println("Conteúdos concluidos por " + peterDev.getNome() +": " + peterDev.getConteudosConcluidos());
        System.out.println("Xp adquirido por "+ peterDev.getNome() + ": " + peterDev.calcularTotalXp());
    }
}