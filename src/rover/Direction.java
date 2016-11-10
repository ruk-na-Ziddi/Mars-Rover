package rover;

enum Direction {
    E {
        @Override
        Cordinate move(Cordinate cordinate) {
            return cordinate.newCordinateWithXInc();
        }

        @Override
        Direction directToRight(Direction direction) {
            return Direction.S;
        }

        @Override
        Direction directToLeft(Direction direction) {
            return Direction.N;
        }
    },
    W {
        @Override
        Cordinate move(Cordinate cordinate) {
            return cordinate.newCordinateWithXDec();
        }

        @Override
        Direction directToRight(Direction direction) {
            return Direction.N;
        }

        @Override
        Direction directToLeft(Direction direction) {
            return Direction.S;
        }
    },
    N {
        @Override
        Cordinate move(Cordinate cordinate) {
            return cordinate.newCordinateWithYInc();
        }

        @Override
        Direction directToRight(Direction direction) {
            return Direction.E;
        }

        @Override
        Direction directToLeft(Direction direction) {
            return Direction.W;
        }
    },
    S {
        @Override
        Cordinate move(Cordinate cordinate) {
            return cordinate.newCordinateWithYDec();
        }

        @Override
        Direction directToRight(Direction direction) {
            return Direction.W;
        }

        @Override
        Direction directToLeft(Direction direction) {
            return Direction.E;
        }
    };
    abstract Cordinate move(Cordinate cordinate);
    abstract Direction directToRight(Direction direction);
    abstract Direction directToLeft(Direction direction);
}
