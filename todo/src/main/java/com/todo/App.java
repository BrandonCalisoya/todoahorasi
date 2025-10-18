package com.todo;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("chupala we wes");
        System.out.println("cmabiando weas");
        System.out.println("anotherone");
        System.out.println("2");
        System.out.println(1+2);


        Task tarea = new Task("tareai", "descripcion", new Date(),new Date(), "alta");

        System.out.println(tarea.getDescpricion());
        System.out.println(tarea.getFechaCreacion());
        System.out.println(tarea.getFechaLimite());
        System.out.println(tarea.getNombre());
        System.out.println(tarea.getPrioridad());

        Dao.initialDb();
    }
}
