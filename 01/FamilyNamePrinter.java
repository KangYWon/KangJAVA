package KangJAVA;

public class FamilyNamePrinter{
    private String[] stringNames;
    private String[] familyNames;

    public static void main(String[] args){
        FamilyNamePrinter Name = new FamilyNamePrinter(args[0]);
        Name.printFamilyNames();
    }
    public FamilyNamePrinter(String names) {
        this.stringNames = names.split( ",");
        for(String name : stringNames){
        for(int i=0;i<stringNames.length; i++){
            stringNames[i] = stringNames[i].trim();
            familyNames = stringNames[i].split(" ");
            name = familyNames[1];
            System.out.println(name);
        }
        break;
    }
        
 }
public String[] printFamilyNames(){
    return familyNames;
}
}


