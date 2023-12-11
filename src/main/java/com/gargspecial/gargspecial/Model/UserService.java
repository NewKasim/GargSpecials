package com.gargspecial.gargspecial.Model;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
  // Simulating an in-memory database to store user credentials
  private static final Map<String, String> userCredentials = new HashMap<>();

  public void createUser(String email, String password) {
      // For simplicity, storing credentials in-memory. In a real app, use a database.
      userCredentials.put(email, password);
  }

  public boolean checkCredentials(String email, String password) {
      // Check if the provided credentials match the stored credentials
      return userCredentials.containsKey(email) && userCredentials.get(email).equals(password);
  }
}