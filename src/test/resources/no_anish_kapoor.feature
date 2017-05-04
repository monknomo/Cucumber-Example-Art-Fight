Feature: Stuart Semple will sell Black 2.0 to any artist except Anish Kapoor

  Scenario Outline: Anish Kapoor tries to buy Black 2.0
    Given a purchaser, <purchaser name>, Black 2.0 oh is <saleable>
    Examples:
      | purchaser name    | saleable     |
      | Anish Kapoor      | not saleable |
      | John Doe          | saleable     |
      | Jane Doe          | saleable     |
      | Manish Kapoor     | saleable     |
      | Anish Kapoorski   | saleable     |