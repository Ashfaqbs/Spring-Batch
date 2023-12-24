/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.main.springboot.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {

	@Bean
	public Job jobBean(JobRepository jobRepository) {

//JobRepository bean here will automatically autowire no need to do a seperate bean		
		return new JobBuilder("jobCSV", jobRepository).// name of the job and jobRepository
				listener(listener)// to listen and do anything when the job starts or the job ends
				.start(steps).build();

	}

}
