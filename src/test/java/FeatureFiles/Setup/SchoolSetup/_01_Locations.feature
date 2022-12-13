Feature: Location Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

    And Click on the element in the left nav
      | setup       |
      | schoolSetup |
      | locations   |

  Scenario Outline: Create a Location

    And Click on the element in the dialog content
      | addButton |
    And User sending the keys in the dialog
      | nameInputOnly | <Name>      |
      | shortNameOnly | <ShortName> |
      | capacity      | <Capacity>  |

    And Click on the element in the dialog content
      | locationsActive |
      | saveButton      |

    And Success message should be displayed
      | successMessage | success |

    Examples:
      | Name   | ShortName | Capacity |
      | Tiflis | Gürcistan | 100      |


  Scenario Outline: Update a Location

    And Click on the element in the form content
      | editButtonLocation |
    And User sending the keys in the dialog
      | nameInputOnly | <Name>      |
      | shortNameOnly | <ShortName> |

    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |

    Examples:
      | Name    | ShortName |
      | Türkiye | Trabzon   |

  Scenario: Delete a Location

    And Click on the element in the form content
      | deleteButtonLocations |
      | deleteButton2         |

    And Success message should be displayed
      | successMessage | success |

