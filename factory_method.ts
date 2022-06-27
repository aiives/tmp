//------------------------------------------Description
/* Implementation of a creational design pattern (Factory Method) in Typescript
 * Idea:
 * This little program could be usefull for a real estate company. It receives different complaints from tennants that all need to be fixed by the right specialists.
 */

//------------------------------------------Classes
interface Issue {
	fix(): string;
}

class PlumbingIssue implements Issue {
	public fix(): string {
		return "Plumber fixed the pipes!";
	}
}

class LightIssue implements Issue {
	public fix(): string {
		return "Electrician fixed issue with lights!";
	}
}

abstract class Specialist {
	public abstract addIssue(): Issue;
	public repair(): string {
		const newIssue = this.addIssue();
		return `Message from landlord: ${newIssue.fix()}`;
	}
}

class Plumber extends Specialist {
	public addIssue(): Issue {
		return new PlumbingIssue();
	}
}

class Electrician extends Specialist {
	public addIssue(): Issue {
		return new LightIssue();
	}
}

//------------------------------------------Functions
function callSpecialist(specialist: Specialist){
	console.log(specialist.repair());
}

//------------------------------------------Main
console.log("You reported a problem with the pipes - Our plumber will have a look!");
callSpecialist(new Plumber());
console.log('');
console.log("You reported a problem with the lights - Our electrician will have a look!");
callSpecialist(new Electrician());
