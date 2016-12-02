package rover;

enum Direction {
    E {
        @Override
        Cordinate move(Cordinate cordinate) {
            return cordinate.newCordinateWithXInc();
        }

        @Override
        Direction directToRight() {
            return Direction.S;
        }

        @Override
        Direction directToLeft() {
            return Direction.N;
        }
    },
    W {
        @Override
        Cordinate move(Cordinate cordinate) {
            return cordinate.newCordinateWithXDec();
        }

        @Override
        Direction directToRight() {
            return Direction.N;
        }

        @Override
        Direction directToLeft() {
            return Direction.S;
        }
    },
    N {
        @Override
        Cordinate move(Cordinate cordinate) {
            return cordinate.newCordinateWithYInc();
        }

        @Override
        Direction directToRight() {
            return Direction.E;
        }

        @Override
        Direction directToLeft() {
            return Direction.W;
        }
    },
    S {
        @Override
        Cordinate move(Cordinate cordinate) {
            return cordinate.newCordinateWithYDec();
        }

        @Override
        Direction directToRight() {
            return Direction.W;
        }

        @Override
        Direction directToLeft() {
            return Direction.E;
        }
    };
    abstract Cordinate move(Cordinate cordinate);
    abstract Direction directToRight();
    abstract Direction directToLeft();
}
