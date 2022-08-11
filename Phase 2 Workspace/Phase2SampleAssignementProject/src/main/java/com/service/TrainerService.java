package com.service;

import java.util.List;

import com.bean.Trainer;
import com.dao.TrainerDao;

public class TrainerService {

	TrainerDao td = new TrainerDao();
	
	public String storeTrainer(Trainer trainer) {
		if(td.storeTrainer(trainer)>0) {
			return "Trainer details stored successfully";
		}else {
			return "Trainer details didn't store";
		}
	}
	
	public List<Trainer> getAllTrainer() {
		return td.findAllTrainer();
	}
}
