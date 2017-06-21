package by.nastin.hotel.service;

import by.nastin.hotel.entity.Feedback;
import by.nastin.hotel.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public List<Feedback> getFeedbacks() {
        return feedbackRepository.findAll();
    }

    public Feedback getFeedbackById(String id) {
        return feedbackRepository.findOne(id);
    }

    public Feedback create(Feedback feedback){
        return feedbackRepository.save(feedback);
    }

    public Feedback update(Feedback feedback){
        return feedbackRepository.save(feedback);
    }
}
