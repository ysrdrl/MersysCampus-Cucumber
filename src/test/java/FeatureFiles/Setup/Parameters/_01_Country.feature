Feature: Country Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @RegressionTest
  Scenario: Create a country
    And Click on the element in the left nav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in the dialog content
      | addButton |

    And User sending the keys in the dialog
      | nameInput | Amzny |
      | codeInput | 71    |

    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |

  @RegressionTest
  Scenario: Update a Country

    And Click on the element in the left nav
      | setup      |
      | parameters |
      | countries  |

    And User sending the keys in the form content
      | searchName | Amzny |
      | searchCode | 71    |

    And Click on the element in the form content
      | searchButton |
      | editButton   |

    And User sending the keys in the dialog
      | nameInput | Amazonya |
      | codeInput | 61       |
    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |

  @RegressionTest
  Scenario: Delete a Country

    And Click on the element in the left nav
      | setup      |
      | parameters |
      | countries  |

    And User sending the keys in the form content
      | searchName | Amazonya |
      | searchCode | 61       |

    And Click on the element in the form content
      | searchButton  |
      | deleteButton  |
      | deleteButton2 |

    And Success message should be displayed
      | successMessage | success |

