Feature: Notification Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


  Scenario: Create a notification
    And Click on the element in the left nav
      | cookies      |
      | messaging    |
      | notification |

    And Click on the element in the dialog content
      | addButton |

    And User sending the keys in the dialog
      | notificationName2 | deneme        |
      | description       | deneme1234455 |

    And Click on the element in the dialog content
      | notificationType |
      | examInfo         |

    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |


  Scenario: Update a notification

    And Click on the element in the left nav
      | cookies      |
      | messaging    |
      | notification |

    And User sending the keys in the form content
      | notificationSearchName | deneme |

    And Click on the element in the form content
      | searchButton |
      | editButton   |

    And User sending the keys in the dialog
      | notificationName2 | Bildirim    |
      | description       | Sınav Sonuç |

    And Click on the element in the dialog content
      | saveButton |

    And Success message should be displayed
      | successMessage | success |


  Scenario: Update a notification

    And Click on the element in the left nav
      | cookies      |
      | messaging    |
      | notification |

    And User sending the keys in the form content
      | notificationSearchName | Bildirim |

    And Click on the element in the form content
      | searchButton  |
      | deleteButton  |
      | deleteButton2 |

    And Success message should be displayed
      | successMessage | success |



