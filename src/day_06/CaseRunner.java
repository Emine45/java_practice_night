package day_06;

public class CaseRunner {

	
	/*
     * Create CaseRunner class
     * actualCase=Covid 19
     * isTested=true
     * conclusion=Tested Negative
     * if conclusion contains "negative" print "You can go to work"
     * otherwise print "15 days quarantine"
     */
	

    public static void main(String[] args) {
        //creating the object
        Case caseObject=new Case();
        
        //assigning the values
        caseObject.setActualCase("Case : Covid 19");
        caseObject.setTested(true);
        caseObject.setConclusion("Conclusion : Tested positive");
        
        //  "\n" means go to the next line
        System.out.println(caseObject.getActualCase()+"\n"+"Tested : "+caseObject.isTested()+"\n"+caseObject.getConclusion());
        
        if(caseObject.getConclusion().toLowerCase().contains("negative")) {
            System.out.println("You can go to work");
        }else {
            System.out.println("15 days quarantine");
        }
        
        
         /*Set your first and last name
         *And print your current case using the Case class objects
         */
        Patient patient=new Patient();
        patient.setFirstName("John");
        patient.setLastName("Cash");
        //setCurrentCase(case object)
        patient.setCurrentCase(caseObject);//the data type of parameter of setCurrentCase is Case
        
        System.out.println(patient.getFirstName()+"\n"+
                patient.getLastName()+"\n"+
                patient.getCurrentCase().getActualCase()+"\n"+
                patient.getCurrentCase().isTested()+"\n"+
                patient.getCurrentCase().getConclusion());
    
	}

}
