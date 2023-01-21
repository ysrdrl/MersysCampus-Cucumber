Feature: Subject Categories Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @SmokeTest
  Scenario: Create a subject categories

    And Click on the element in the left nav
      | education         |
      | educationSetup    |
      | subjectCategories |

    And Click on the element in the dialog content
      | addButton |

    And User sending the keys in the dialog
      | nameInput | deneme159 |
      | codeInput | 02        |

    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |

  @SmokeTest
  Scenario: Update a subject categories

    And Click on the element in the left nav
      | education         |
      | educationSetup    |
      | subjectCategories |

    And User sending the keys in the form content
      | searchName | deneme159 |

    And Click on the element in the form content
      | searchButton |
      | editButton   |

    And User sending the keys in the dialog
      | nameInput | New Month |
      | codeInput | 01        |

    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |

  @SmokeTest
  Scenario: Delete a subject categories

    And Click on the element in the left nav
      | education         |
      | educationSetup    |
      | subjectCategories |

    And User sending the keys in the form content
      | searchName | New Month |

    And Click on the element in the form content
      | searchButton  |
      | deleteButton  |
      | deleteButton2 |

    And Success message should be displayed
      | successMessage | success |