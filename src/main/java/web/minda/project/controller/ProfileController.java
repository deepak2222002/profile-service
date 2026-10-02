package web.minda.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	@Operation(summary = "Get profile details", description = "Fetches the profile details of the currently logged-in employee.")
	@ApiResponses({ @ApiResponse(responseCode = "200", description = "Profile details fetched successfully"),
			@ApiResponse(responseCode = "401", description = "User is not authenticated"),
			@ApiResponse(responseCode = "404", description = "Profile not found") })

	@GetMapping("getProfileDetail")
	public ResponseEntity<String> getProfileDetail() {

		return new ResponseEntity<>("Successfully", HttpStatus.OK);

	}

	@GetMapping("getExperienceDetail")
	public ResponseEntity<String> getExperienceDetail() {

		return new ResponseEntity<>("Successfully", HttpStatus.OK);

	}

}
