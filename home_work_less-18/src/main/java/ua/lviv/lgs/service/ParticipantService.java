package ua.lviv.lgs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.ParticipantRepo;
import ua.lviv.lgs.domain.Participant;

@Service
public class ParticipantService {

	@Autowired
	private ParticipantRepo participantRepo;
	
	public List<Participant> findAllParticipants(){
		return participantRepo.findAllParticipants();
	}
	
	public Participant findOne(Integer id) {
		return participantRepo.findOne(id);
	}
	
	public void save(Participant participant) {
		participantRepo.save(participant);
	}
	
	public void delete(Integer id) {
		participantRepo.delete(id);
	}
}
