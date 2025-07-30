package com.example.ABD.SPRINGWEBAPP.Service;

import com.example.ABD.SPRINGWEBAPP.Model.JobPost;
import com.example.ABD.SPRINGWEBAPP.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    public List<JobPost> viewAllJobs(){
        return repo.viewAllJobs();
    }

    public JobPost addJob(JobPost jobPost){
        return repo.addJob(jobPost);
    }
    public JobPost getJob(int n){
        return repo.getJob(n);
    }

    public JobPost updateJob(JobPost jobPost) {
        return repo.updateList(jobPost);
    }

    public void deleteJob(int n) {
        repo.deleteJob(n);
    }
}
