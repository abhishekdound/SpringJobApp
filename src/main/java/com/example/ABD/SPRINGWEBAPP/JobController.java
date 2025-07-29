package com.example.ABD.SPRINGWEBAPP;

import com.example.ABD.SPRINGWEBAPP.Model.JobPost;
import com.example.ABD.SPRINGWEBAPP.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);

        return "success";
    }
//    @ModelAttribute("jobPosts")
//    public List<JobPost>list(){
//
//        List<JobPost>list=jobService.viewAllJobs();
//        return list;
//    }

    @GetMapping("/viewalljobs")
    public ModelAndView viewAllJobs(ModelAndView modelAndView){
        List<JobPost>list=jobService.viewAllJobs();
        modelAndView.addObject("jobPosts",list);
        modelAndView.setViewName("viewalljobs");
        return modelAndView;

    }
}
