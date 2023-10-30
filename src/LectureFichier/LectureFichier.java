package LectureFichier;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class LectureFichier {
	public static void main(String[] args) {
		
		int NumeroLineActuelle=0;
    	int note=0;
        String AnswerLine;
        String PropositionLine;
        String ReponseLine;
        String WriteFilePath = "./src/LectureFichier/fichier/reponseUtilisateur.txt";
        // Spécifiez le chemin du fichier que vous souhaitez lire
        String ReadFilePath = "./src/LectureFichier/fichier/questions.txt";
        String PropositionFilePath = "./src/LectureFichier/fichier/reponseJustes.txt";

        Scanner scanner = new Scanner(System.in); // Scanner pour obtenir l'entrée de l'utilisateur

        // Créez un objet File en utilisant le chemin du fichier
        File AnswerFile = new File(ReadFilePath);
        File PropositionFile = new File(PropositionFilePath);

        

        try {
            // Créez un objet FileReader en utilisant l'objet File
            FileReader AnswerFileReader = new FileReader(AnswerFile);
            FileReader PropositionFileReader = new FileReader(PropositionFile);
            // Créez un objet BufferedReader en utilisant le FileReader
            BufferedReader AnswerBufferedReader = new BufferedReader(AnswerFileReader);
            BufferedReader PropositionBufferedReader = new BufferedReader(PropositionFileReader);

            FileWriter ReponseSauvegarde = new FileWriter(WriteFilePath);

            
            // Lisez le fichier ligne par ligne
            while (((AnswerLine = AnswerBufferedReader.readLine()) != null) && ((PropositionLine = PropositionBufferedReader.readLine()) != null) ) {
            	if (!AnswerLine.isEmpty()) {
                    System.out.println(AnswerLine); // Affichez chaque ligne du fichier de question question.txt                    
                    System.out.println(PropositionLine); // Affichez chaque ligne du fichier de proposition des reponse reponseJuste.txt
                    // Attendez la réponse de l'utilisateur
                    
                    System.out.print("Votre réponse : ");
                    String reponseUtilisateur = scanner.nextLine();
                    
                    // Écrivez la réponse de l'utilisateur dans le fichier de sauvegarde
                    ReponseSauvegarde.write(reponseUtilisateur + "\n");
            	}

            }

            // Fermez le BufferedReader et le FileReader une fois la lecture terminée
            AnswerBufferedReader.close();
            PropositionBufferedReader.close();
            AnswerFileReader.close();
            ReponseSauvegarde.close();
            PropositionFileReader.close();
            scanner.close();
            ReponseSauvegarde.close();
            
//          BLOC DE TRAITEMENT DE LA REPONSE DE L'UTILISATEUR:
            File ResponseFile = new File(WriteFilePath);
            FileReader ResponseFileReader = new FileReader(ResponseFile);
            // Créez un objet BufferedReader en utilisant le FileReader
            BufferedReader ResponseBufferedReader = new BufferedReader(ResponseFileReader);
            
            while (((ReponseLine = ResponseBufferedReader.readLine()) != null)) {
                
                NumeroLineActuelle++;
                
            	if(NumeroLineActuelle==1) {
            		if(ReponseLine.equals("A")) {
            			note++;

            		}
            	}
            	if(NumeroLineActuelle==2) {
            		if(ReponseLine.equals("B")) {
            			note++;
            		}
            	}
            	if(NumeroLineActuelle==3) {
            		if(ReponseLine.equals("C")) {
            			note++;
            		}
            	}
            	if(NumeroLineActuelle==4) {
            		if(ReponseLine.equals("C")) {
            			note++;
            		}
            	}
            	if(NumeroLineActuelle==5) {
            		if(ReponseLine.equals("A")) {
            			note++;            		}
            	}
            	if(NumeroLineActuelle==6) {
            		if(ReponseLine.equals("A")) {
            			note++;            		}
            	}
            	if(NumeroLineActuelle==7) {
            		if(ReponseLine.equals("A")) {
            			note++;            		}
            	}
            	if(NumeroLineActuelle==8) {
            		if(ReponseLine.equals("B")) {
            			note++;            		}
            	}
            	if(NumeroLineActuelle==9) {
            		if(ReponseLine.equals("A")) {
            			note++;            		}
            	}
            	if(NumeroLineActuelle==10) {
            		if(ReponseLine.equals("A") || ReponseLine.equals("B") ) {
            			note++;            		}
            	}
            	
            	
            }
            
            System.out.println("vous avez obtenu une note de:"+""+note+"/"+NumeroLineActuelle);
            
            
            ResponseFileReader.close();
            ResponseBufferedReader.close();
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
