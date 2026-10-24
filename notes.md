# Behaviours

- Interpret/parse the string representation
- Compute the score a Cribbage Hands
  - Fifteen twos
    - Find all the possible combinations of cards
  - Runs
  - Pairs
  - Flush
- Print the score

# Tests
Suits: ♠ ♥ ♦ ♣

- "3♥" -> Card with suite Hearts
- "3♥" -> Card with rank 3
- "J♥" -> Card with rank Jack and suite Hearts
- "5♣" -> Card with rank 5 and suite Clubs
- "6♦" -> Card with rank 6 and suite Diamonds
- "A♣" -> Card with rank Ace and suite Spades
- "5♥5♦5♠J♣5♣" -> Cribbage Hand with cards ... and Starter 5 of Clubs