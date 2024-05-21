package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private String name;
    private String CPF;
    private Date birth;
    private int age;

    public Pessoa(String name, String CPF, String birth) throws ParseException {
        this.name = name;
        this.CPF = CPF;
        convertDate(birth);
        calculateAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getBirth() {
        //Instancia um objeto da classe Calendar
        Calendar calendar = Calendar.getInstance();
        
        //Passa data do aniversário
        calendar.setTime(this.birth);        
        
        //Armazena data de nascimento como String
        String birthDay = ("" + calendar.get(Calendar.DAY_OF_MONTH));
        String birthMonth = ("" + calendar.get(Calendar.MONTH) + 1);
        String birthYear = ("" + calendar.get(Calendar.YEAR));
        
        /*
        //Sem manipulação
        int birthDay = calendar.get(Calendar.DAY_OF_MONTH);
        int birthMonth = calendar.get(Calendar.MONTH) + 1;
        int birthYear = calendar.get(Calendar.YEAR);
        */
        
        return (birthDay + "/" + birthMonth + "/" + birthYear);
    }

    public void setBirth(String birth) throws ParseException {
        convertDate(birth);
    }

    public int getAge() {
        return age;
    }
    
    private void convertDate(String birth) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.birth = dateFormat.parse(birth);
    }
    
    private void calculateAge() {
        //Recebe a data atual do sistema
        Date today = new Date();
        
        //Instancia um objeto da classe Calendar
        Calendar calendar = Calendar.getInstance();
        
        //Passa data de hoje
        calendar.setTime(today);
        
        //Armazena data atual nas variáveis
        int dayToday = calendar.get(Calendar.DAY_OF_MONTH);
        int monthToday = calendar.get(Calendar.MONTH) + 1;
        int yearToday = calendar.get(Calendar.YEAR);        

        //Passa data do aniversário
        calendar.setTime(this.birth);        
        
        //Armazena data de nascimento
        int dayBirth = calendar.get(Calendar.DAY_OF_MONTH);
        int monthBirth = calendar.get(Calendar.MONTH) + 1;
        int yearBirth = calendar.get(Calendar.YEAR);
        
        this.age = yearToday - yearBirth;
        if(monthToday < monthBirth) {
            this.age --;
        } else if(monthToday == monthBirth && dayToday < dayBirth) {
             this.age --;
        }
        
        if(age < 0) {
            this.age = 0;
        }
    }
}
