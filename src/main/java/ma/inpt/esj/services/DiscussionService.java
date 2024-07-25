package ma.inpt.esj.services;

import ma.inpt.esj.dto.DiscussionRequestDto;
import ma.inpt.esj.dto.DiscussionResponseDto;
import ma.inpt.esj.entities.Discussion;
import ma.inpt.esj.exception.DiscussionException;
import ma.inpt.esj.exception.DiscussionNotFoundException;
import ma.inpt.esj.exception.MedecinNotFoundException;
import java.util.List;

public interface DiscussionService {
    List<DiscussionResponseDto>  getAllDiscussions() throws DiscussionException;
    Discussion createDiscussion(Discussion discussion) throws DiscussionException;

    DiscussionResponseDto createDiscussion(DiscussionRequestDto discussionRequestDto, Long organizerId) throws DiscussionException;

    List<Discussion> getDiscussionsByMedecinSpecialite(Long medecinId) throws MedecinNotFoundException;

    List<Discussion> getDiscussionByMedecinResponsable(Long medcinId) throws MedecinNotFoundException;
    List<Discussion> getByParticipantId(Long medecinId) throws MedecinNotFoundException;

    List<Discussion> getFinishedDiscussionsByParticipantId(Long medecinId) throws MedecinNotFoundException;


    Discussion getDiscussion(Long id) throws DiscussionNotFoundException;
    DiscussionResponseDto getDiscussionResponseDto(Long id) throws DiscussionNotFoundException; 
    Discussion startDiscussion(Long id, Long userId) throws DiscussionNotFoundException, DiscussionException;
    Discussion joinDiscussion(Long id, Long medecinId) throws DiscussionNotFoundException, MedecinNotFoundException, DiscussionException;

}
