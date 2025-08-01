package com.example.ABD.SPRINGWEBAPP.Repo;

import com.example.ABD.SPRINGWEBAPP.Model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> list = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),

            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    List.of("HTML", "CSS", "JavaScript", "React")),

            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),

            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),

            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    List.of("iOS Development", "Android Development", "Mobile App")),

            new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines", 4,
                    List.of("DevOps", "CI/CD", "Docker", "Kubernetes")),

            new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces", 2,
                    List.of("User Experience", "User Interface Design", "Prototyping")),

            new JobPost(8, "Cybersecurity Analyst", "Protect computer systems and networks from cyber threats", 4,
                    List.of("Cybersecurity", "Network Security", "Incident Response")),

            new JobPost(9, "Full Stack Developer", "Experience in both front-end and back-end development", 5,
                    List.of("JavaScript", "Node.js", "React", "Spring", "MongoDB")),

            new JobPost(10, "Cloud Architect", "Design and implement cloud infrastructure solutions", 6,
                    List.of("Cloud Computing", "AWS", "Azure", "Google Cloud")),

            new JobPost(11, "Software Tester", "Ensure software quality through testing and validation", 3,
                    List.of("Testing", "JUnit", "Selenium", "TestNG")),

            new JobPost(12, "React Native Developer", "Develop cross-platform mobile applications using React Native", 2,
                    List.of("React Native", "JavaScript", "Mobile App Development")),

            new JobPost(13, "Business Analyst", "Analyze business processes and recommend improvements", 4,
                    List.of("Business Analysis", "Requirements Gathering", "Process Modeling")),

            new JobPost(14, "Embedded Systems Engineer", "Design and develop embedded systems for hardware applications", 5,
                    List.of("Embedded Systems", "C/C++", "Microcontrollers", "RTOS")),

            new JobPost(15, "Content Writer", "Create engaging and informative content for websites and publications", 2,
                    List.of("Content Writing", "Copywriting", "SEO", "Creative Writing")),

            new JobPost(16, "Business Intelligence Analyst", "Utilize data to provide insights and support decision-making", 4,
                    List.of("Business Intelligence", "SQL", "Data Warehousing", "Tableau")),

            new JobPost(17, "UX Researcher", "Conduct user research to inform the design process", 3,
                    List.of("User Research", "Usability Testing", "Human-Computer Interaction")),

            new JobPost(18, "Backend Developer", "Build server-side logic and databases for web applications", 4,
                    List.of("Java", "Spring", "Node.js", "MongoDB")),

            new JobPost(19, "Game Developer", "Create and optimize games for various platforms", 3,
                    List.of("Game Development", "Unity", "C#", "3D Modeling")),

            new JobPost(20, "IT Project Manager", "Lead and manage IT projects from initiation to completion", 6,
                    List.of("Project Management", "Agile", "Scrum", "Risk Management"))
    ));
    public List<JobPost> viewAllJobs(){
        return list;
    }
    public JobPost addJob(JobPost jobPost){
        list.add(jobPost);
        return jobPost;
    }

    public JobPost getJob(int n) {
        return list.stream().filter(i->i.getPostId()==n).findFirst().orElse(null);
    }

    public JobPost updateList(JobPost jobPost) {

        int index=0;
        boolean flag=false;
        for (JobPost jobPost1:list){
            if(jobPost1.getPostId()==jobPost.getPostId()){
                flag=true;
                break;
            }
            ++index;
        }
        if(!flag){
            return null;
        }
        list.set(index,jobPost);
        return list.get(index);
    }

    public void deleteJob(int n) {
        int i=0;
        boolean flag=false;
        for (JobPost jobPost:list){
            if (jobPost.getPostId()==n){
                flag=true;
                break;
            }
            ++i;
        }
        if(!flag){
            return;
        }
        list.remove(i);
    }
}
