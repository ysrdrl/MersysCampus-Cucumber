Feature: States Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @RegressionTest
  Scenario: Create a states

    And Click on the element in the left nav
      | setup      |
      | parameters |
      | states     |

    And Click on the element in the dialog content
      | addButton     |
      | countryMenu   |
      | selectCountry |

    And User sending the keys in the dialog
      | nameInput | Deneme052  |
      | shortName | KisaDeneme |

    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |

  @RegressionTest
  Scenario: Update a states

    And Click on the element in the left nav
      | setup      |
      | parameters |
      | states     |

    And User sending the keys in the form content
      | searchName | Deneme052 |

    And Click on the element in the form content
      | searchButton |
      | editButton   |

    And User sending the keys in the dialog
      | nameInput | Yeniay |
      | shortName | 611    |

    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |

  @RegressionTest
  Scenario: Delete a states

    And Click on the element in the left nav
      | setup      |
      | parameters |
      | states     |

    And User sending the keys in the form content
      | searchName | Yeniay |

    And Click on the element in the form content
      | searchButton  |
      | deleteButton  |
      | deleteButton2 |

    And Success message should be displayed
      | successMessage | success |




