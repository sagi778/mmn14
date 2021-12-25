public class Student {

    //attributes
    private String _name = "";
    private String _surename = "";
    private int _yearOfBirth = 0;
    private int _id = 111111111;

    //constructors
    public Student(){}
    public Student(String name){
        _name = name;
    }
    public Student(String name,String surename){
        _name = name;
        _surename = surename;
    }
    public Student(String name,String surename,int yearOfBirth){
        _name = name;
        _surename = surename;
        _yearOfBirth = yearOfBirth;
    }
    public Student(String name,String surename,int yearOfBirth,int id){
        _name = name;
        _surename = surename;
        _yearOfBirth = yearOfBirth;
        _id = id;
    }

    //get & set
    public String getName(){return _name;}
    public String getSureName(){return _surename;}
    public int getYearOfBirth(){return _yearOfBirth;}
    public int getId(){return _id;}

}
