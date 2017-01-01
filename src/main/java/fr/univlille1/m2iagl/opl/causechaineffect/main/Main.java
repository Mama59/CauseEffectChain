package fr.univlille1.m2iagl.opl.causechaineffect.main;

import fr.univlille1.m2iagl.opl.causechaineffect.action.ddebugger.DDebugger;
import fr.univlille1.m2iagl.opl.causechaineffect.action.ddebugger.MyDDebugger;
import fr.univlille1.m2iagl.opl.causechaineffect.challenge.MyFifthChallenge;
import fr.univlille1.m2iagl.opl.causechaineffect.model.Constants;

public class Main {

	public static void main(String[] args) {

		Constants.init();

		boolean verbose = false, allVars = false;

		for(int i=0;i<args.length;i++){
			if(args[i].equals("-v"))
				verbose = true;
			else if (args[i].equals("-a"))
				allVars = true;
		}

		DDebugger<?> d = new MyDDebugger<String>(verbose, allVars);
		
		long t = System.currentTimeMillis();
		System.out.println(d.debug(new MyFifthChallenge()));	
		System.out.println(System.currentTimeMillis() - t + " ms");
	}
}
