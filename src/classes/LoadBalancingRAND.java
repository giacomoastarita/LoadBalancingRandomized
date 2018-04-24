package classes;

import java.util.ArrayList;
import java.util.Random;

public class LoadBalancingRAND extends LoadBalancing {

	public ArrayList<Macchina> jobsBalancingRAND(ArrayList<Integer> allLoad,ArrayList<Macchina> allMachine) {

		Random r = new Random();
		int passo = 0;
		while(allLoad.size() != 0){
			int random = r.nextInt(allLoad.size());
			int value = allLoad.get(random);
			int toLoad = controlLoad(allMachine);
			allMachine.get(toLoad).addLoad(value);
			allLoad.remove(random);

			System.out.println("Passo: "+ passo+" -> Macchina: "+ allMachine.get(toLoad).getName() + 
					", Carico inserito: [" + value + "], Carico totale: " + allMachine.get(toLoad).getTotalLoad());
			passo++;
			System.out.println("------------------------------------------------------------------");
		}
		
		return allMachine;

		

	}
	
}