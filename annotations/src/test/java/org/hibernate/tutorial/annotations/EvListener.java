package org.hibernate.tutorial.annotations;

import javax.persistence.PostPersist;

public class EvListener {
	@PostPersist
	public void eventPostPersist(){
		System.out.println("Listener Event Post Persistent:" );
	}

}
