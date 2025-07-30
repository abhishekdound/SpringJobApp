package com.example.ABD.SPRINGWEBAPP.Controller;

import com.example.ABD.SPRINGWEBAPP.Model.JobPost;
import com.example.ABD.SPRINGWEBAPP.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class JopPostController {
    @Autowired
    private JobService jobService;
    @GetMapping(value = "posts")
    @ResponseBody
    public List<JobPost> jobPostList(){
        return jobService.viewAllJobs();

    }
    @GetMapping("posts/{jobId}")
    @ResponseBody
    public JobPost jobPost(@PathVariable("jobId")int n){
        return jobService.getJob(n);
    }

    @PostMapping("jobPost")
    @ResponseBody
    public JobPost addJob(@RequestBody JobPost jobPost){
        return jobService.addJob(jobPost);
    }

    @PutMapping("jobPost")
    @ResponseBody
    public JobPost updateJob(@RequestBody JobPost jobPost){
        return jobService.updateJob(jobPost);
    }

    @DeleteMapping("jobPost/{jobId}")
    @ResponseBody
    public String deleteJob(@PathVariable("jobId")int n){
        jobService.deleteJob(n);
        return "deleted Job Post with Id " + n;
    }
}
