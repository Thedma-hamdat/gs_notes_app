package com.gsnotes.web.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class ModuleModel {


	private Long idModule;

	@NotBlank(message = "This field is required")
	private String titre;

	@NotBlank(message = "This field is required")
	private String code;
	
	private int idNiveau;
	
	
	public ModuleModel() {
		
	}

	public ModuleModel(int idNiveau) {
		this.idNiveau = idNiveau;
	}



	public Long getIdModule() {
		return idModule;
	}

	public void setIdModule(Long idModule) {
		this.idModule = idModule;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	

	public int getNiveau() {
		return idNiveau;
	}

	public void setNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}

	

	@Override
	public String toString() {
		return "ModuleModel [idModule=" + idModule + ", titre=" + titre + ", code=" + code + "niveau="
				+ idNiveau + "]";
	}

}
